import java.util.HashMap;

public class hashmaps {
    public static void main(String args[]) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Maths", 88);
        examScores.put("Science", 90);
        examScores.put("English", 78);
        examScores.put("History", 85);
        examScores.put("Geography", 82);
        examScores.put("Computer Science", 95);

        System.out.println(examScores.get("Maths"));
        System.out.println(examScores.toString());

        examScores.remove("Maths");
        System.out.println(examScores.toString());

        System.out.println(examScores.containsKey("Maths"));
        System.out.println(examScores.containsValue(90));

        System.out.println(examScores.keySet());
        System.out.println(examScores.values());

        for (String key : examScores.keySet()) {
            System.out.println(key + " : " + examScores.get(key));
        }

        examScores.putIfAbsent("Hindi", 75);

        examScores.replace("Hindi", 75, 80);

        System.out.println(examScores.toString());

        System.out.println(examScores.getOrDefault("Quantum", -1));

        System.out.println(examScores.size());

        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score + 5);
        });

        examScores.clear();

        System.out.println(examScores.isEmpty());
    }
}
