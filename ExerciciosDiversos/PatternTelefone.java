package ExerciciosDiversos;

/*
  * Telefone fixo (8 dígitos sem DDD xxxx-xxxx, 10 Dígitos com DDD (xx)xxxx-xxxx);
  * Celular (9 dígitos sem DDD xxxxx-xxxx, 11 dígitos (xx)xxxxx-xxxx);
*/

public class PatternTelefone {
    public static void main(String[] args) {
        System.out.println(applyPattern("9712345678"));
    }

    private static String applyPattern(String phone) {
        return switch (phone.length()) {
            case 8 -> {
                yield "Telfone: "
                + phone.substring(0, 4) + "-"
                + phone.substring(4, 8);
            }
            case 10 -> {
                yield "Telfone: "
                + "(" + phone.substring(0, 2) + ")"
                + phone.substring(2, 6) + "-"
                + phone.substring(6, 10);
            }
            case 9 -> {
                yield "Celular: "
                + phone.substring(0, 5) + "-"
                + phone.substring(5, 9);
            }
            case 11 -> {
                yield "Celular: "
                + "(" + phone.substring(0, 2) + ")"
                + phone.substring(2, 7) + "-"
                + phone.substring(7, 11);
            }
            default -> phone;
        };
    }
}
