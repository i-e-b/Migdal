package e.s.miniweb.models;

public class CaseSubstituteModel {
    public final String substituteType;
    public final String codePoint;
    public final String basicName;

    public CaseSubstituteModel(String substituteType, CharacterInfoModel character) {
        this.substituteType = substituteType;
        this.basicName = character.basicName;
        this.codePoint = character.codePoint;
    }
}
