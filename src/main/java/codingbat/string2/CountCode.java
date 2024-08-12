package codingbat.string2;

public class CountCode {
    public int countCode(String str) {
        int count = 0; // Счётчик для вхождений "code"

        // Проходим по строке от 0 до str.length() - 3
        for (int i = 0; i <= str.length() - 4; i++) {
            // Проверяем подстроку длиной 4 символа
            String substring = str.substring(i, i + 4);
            // Проверяем, соответствует ли подстрока шаблону "co_d"
            if (substring.charAt(0) == 'c' && substring.charAt(1) == 'o' &&
                    substring.charAt(3) == 'e') {
                count++; // Увеличиваем счётчик, если подстрока соответствует
            }
        }
        return count; // Возвращаем количество вхождений
    }

}
