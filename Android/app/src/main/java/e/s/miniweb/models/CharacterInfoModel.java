package e.s.miniweb.models;

import java.util.ArrayList;
import java.util.List;

public class CharacterInfoModel {
    public final List<String> relatedCharacters;
    public final List<String> derivedCharacters;
    public final List<CaseSubstituteModel> caseSubstitutes;

    public String codePoint;
    public String basicName;
    public String unicodeReleaseVersion;


    public String planeName;
    public String planeStart;
    public String planeEnd;
    public String sourceBlockName;
    public String blockStart;
    public String blockEnd;

    public String scriptName;
    public String scriptCode;
    public String categoryName;
    public String categoryCode;
    public String directionName;
    public String directionCode;
    public String combiningClassName;
    public String combiningClassCode;

    public CharacterInfoModel(String codePoint, String basicName){
        this.codePoint = codePoint;
        this.basicName = basicName;

        // TODO: this is all samples. Should load from a config/data file
        unicodeReleaseVersion = "1.1 (June 1993)";

        planeName = "Basic Multilingual Plane";
        planeStart = "0000";
        planeEnd = "FFFF";

        sourceBlockName = "Basic Latin";
        blockStart = "0000";
        blockEnd = "0000";

        scriptName = "Latin";
        scriptCode = "Latn";
        categoryName = "Uppercase Letter";
        categoryCode = "Lu";
        directionName = "Left to Right";
        directionCode = "L";
        combiningClassName = "Not Reordered";
        combiningClassCode = "O";

        // shove in some sample data
        relatedCharacters = new ArrayList<>();
        relatedCharacters.add("one");
        relatedCharacters.add("two");

        derivedCharacters = new ArrayList<>();
        derivedCharacters.add("three");
        derivedCharacters.add("four");

        caseSubstitutes = new ArrayList<>();
        caseSubstitutes.add(new CaseSubstituteModel("Lowercase", this));
    }
}
