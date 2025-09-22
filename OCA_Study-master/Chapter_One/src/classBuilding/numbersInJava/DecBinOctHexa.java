package classBuilding.numbersInJava;

public class DecBinOctHexa {
    public static void main(String[] args) {
        //decimal:
        int x = 42;
        //binary: 0b or 0B; without punt
        int y = 0b1010;
        double y1 = 0b101010101;
        float y2 = 0b101010;
        long y3 = 0b101010010;
        char y4 = 0b10010;
        byte y5 = 0b1010;
        short y6 = 0b101010;
        //octal: 0-7; 8; without punt for int byte short
        int a = 017;
        double a1 = 012.5;
        float a2 = 0.145f;
        //hexadecimal - 0x or 0X; A-F(10-15); 16
        // if we want to use punt here - we have to add 'p'
        int b = 0xA1F_FF;
        double b1 = 0X12.3p546;

        double d = 43e1;
    }
}
