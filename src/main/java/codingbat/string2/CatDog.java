package codingbat.string2;

public class CatDog {
    public boolean catDog(String str) {
        int catCount = 0; // счётчик для "cat"
        int dogCount = 0; // счётчик для "dog"

        for (int i = 0; i <= str.length() - 3; i++) {
            // Проверяем подстроку длиной 3 символа
            String substring = str.substring(i, i + 3);
            if (substring.equals("cat")) {
                catCount++;
            } else if (substring.equals("dog")) {
                dogCount++;
            }
        }

        // Возвращаем true, если количество "cat" равно количеству "dog"
        return catCount == dogCount;
    }
}
