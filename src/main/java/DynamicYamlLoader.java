import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.representer.Representer;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class DynamicYamlLoader {
    public static void main(String[] args) {
        Yaml yaml = new Yaml(new Constructor(Map.class));

        try (InputStream inputStream = new FileInputStream("/Users/kartikdixit/IdeaProjects/maestro/Scripts/testScript.yaml")) {
            Map<String, Object> data = yaml.load(inputStream);

            // Print the loaded YAML data for debugging
            System.out.println("Loaded YAML data: " + data);

            // Define the list of answers
            List<String> answers = List.of(
                    "c) Paris",
                    "b) Oxygen",
                    "c) William Shakespeare",
                    "c) Jupiter",
                    "b) 1912",
                    "c) 2",
                    "c) Leonardo da Vinci",
                    "b) Avocado",
                    "b) Japan",
                    "a) 0"
            );

            // Navigate through the steps and locate the repeat block
            List<Object> steps = (List<Object>) data.get("---");
            if (steps == null) {
                System.err.println("Steps not found in the YAML data.");
                return;
            }

            for (Object step : steps) {
                if (step instanceof Map && ((Map<?, ?>) step).containsKey("repeat")) {
                    Map<String, Object> repeatCommand = (Map<String, Object>) ((Map<?, ?>) step).get("repeat");
                    List<Object> commands = (List<Object>) repeatCommand.get("commands");

                    if (commands == null || commands.isEmpty()) {
                        System.err.println("Commands not found in the repeat block.");
                        return;
                    }

                    // Clear the commands and add dynamically loaded answers
                    commands.clear();
                    for (String answer : answers) {
                        commands.add(Map.of("tapOn", answer));
                    }
                }
            }

            // Save the updated YAML data back to the file
            DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            Yaml outputYaml = new Yaml(new Representer(), options);
            try (FileWriter writer = new FileWriter("/Users/kartikdixit/IdeaProjects/maestro/Scripts/testScript.yaml")) {
                outputYaml.dump(data, writer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
