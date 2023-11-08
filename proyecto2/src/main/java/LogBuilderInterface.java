public interface LogBuilderInterface {

    public void addFile(Protocol protocol, String versionFileContent);

    public void addConnections(String connections);

    public String getlogType();

}
