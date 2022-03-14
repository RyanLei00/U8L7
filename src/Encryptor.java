public class Encryptor {
    private String[][] letterBlock;

    public Encryptor(String[][] letterBlock){
        this.letterBlock = letterBlock;
    }

    public String encryption(int rowShift) {
        String[][] print = new String[letterBlock.length][letterBlock[0].length];
        String str = "";
        for (int r = 0; r < letterBlock.length; r++) {
            for (int c = 0; c < letterBlock[0].length; c++) {
                if (c + rowShift > letterBlock[0].length) {
                    if(c + 1 > letterBlock[0].length){
                        print[r][0 + rowShift] += letterBlock[r][c];
                    }
                    if(c + 1 < letterBlock[0].length){
                        int difference = 0;
                        difference = c - letterBlock[0].length;
                        print[r][0 + difference] += letterBlock[r][c];
                    }
                }
            }
        }
        System.out.println(print[0][0]);
        for (int r = 0; r < print.length; r++) {
            for (int c = 0; c < print[0].length; c++) {
                str += print[r][c];
            }
        }
        return str;
    }

}
