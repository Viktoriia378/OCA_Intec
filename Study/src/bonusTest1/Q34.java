package bonusTest1;

public class Q34 {
    public int width, height;
    public void showImage() throws Exception {
        if(width < 0 || height < 0)
            throw new Exception("Invalid image size");
        else
            System.out.println("1");
    }

    public static void main(String[] args) {
        Q34 image = new Q34();
        image.width = -10;
        try{
            image.showImage();
            System.out.println("2");
        }catch(Exception e){
            System.out.println("3");
        }
        System.out.println("4");
    }
}
