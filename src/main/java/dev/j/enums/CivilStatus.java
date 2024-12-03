package dev.j.enums;

public enum CivilStatus {
    SINGLE(0),
    MARRIED(1),
    WIDOW(2);

    private int code;

    private CivilStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static CivilStatus fromCode(int code){
        return switch (code){
            case 0 -> CivilStatus.MARRIED;
            case 1 ->CivilStatus.SINGLE;
            case 2 -> CivilStatus.WIDOW;
            default -> null;
        };
    }
}
