/**
 * Protocol for the communication between the server and the client
 */
public enum Protocol {
    /* Save a file request */
    SAVE,
    /* Modify a file request */
    MODIFY,
    /* Request a file */
    REQUEST_FILE,
    /* Request iterator with the names of the files in the directory */
    REQUEST_FILES,
    /* Request to end the connection. */
    END_CONNECTION,
}
