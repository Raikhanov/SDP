import java.util.ArrayList;
import java.util.List;

class VersionControl {
    private List<DocumentVersion> versionList = new ArrayList<>();

    public void saveVersion(DocumentVersion version) {
        versionList.add(version);
    }

    public DocumentVersion getVersion(int index) {
        return versionList.get(index);
    }
}