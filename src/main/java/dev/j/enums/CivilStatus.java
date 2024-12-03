package dev.j.enums;

public enum CivilStatus {
    SINGLE(0, "Single"),
    MARRIED(1, "Married"),
    WIDOW(2, "Widow");

    private int code;
    private String display;

    private CivilStatus(int code, String display) {
        this.code = code;
        this.display = display;

    }

    public String getDsiplay() {
        return this.display;

    }

    public int getCode() {
        return code;
    }

    public static CivilStatus fromCode(int code) {
        return switch (code) {
            case 0 -> CivilStatus.MARRIED;
            case 1 -> CivilStatus.SINGLE;
            case 2 -> CivilStatus.WIDOW;
            default -> null;
        };
    }
}
