class Classroom {
    public static void main(String[] arg) {
        Wilder matthieu = new Wilder("Matthieu", false);
        Wilder bastien = new Wilder("Bastien", true);
        Wilder lylian = new Wilder("Lylian", false);
        Wilder owenn = new Wilder("Owenn", true);

        System.out.println(matthieu.whoIAm());
        System.out.println(bastien.whoIAm());
        System.out.println(lylian.whoIAm());
        System.out.println(owenn.whoIAm());
    }
}