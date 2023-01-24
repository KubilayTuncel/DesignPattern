package StructuralDP.FacadeDP;

public class CustomEncryptor {

    public static void main(String[] args) {

        String text = "Content";
        //**kötü kod örnegi
        AESEncryptor aesEncryptor = new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor = new MD5Encryptor();
        md5Encryptor.encrypt(text,"SecretKey");

        SHAEncryptor shaEncryptor = new SHAEncryptor();
        shaEncryptor.encrypt(text,"SecretKey",true);

        //**FacedeDP ile kod
        System.out.println("***********************************");

        EncrytorFacade encrytorFacade = new EncrytorFacade();

        encrytorFacade.encrypt(text, EncrytorFacade.EncType.SHA);
        encrytorFacade.encrypt(text, EncrytorFacade.EncType.MD5);
        encrytorFacade.encrypt(text, EncrytorFacade.EncType.AES);
    }
}
