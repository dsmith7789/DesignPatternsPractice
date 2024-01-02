import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);  // calls constructor of FilterInputStream
    }

    /**
     * Reads a single byte of data from the input stream and converts it to lowercase.
     * 
     * @return  the next byte of data, or -1 if the end of the stream is reached.
     * @throws  IOException if an I/O error occurs.
     */
    public int read() throws IOException {
        int c = super.read();   // returns 0-255 unless at end of stream (then -1)
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    /**
     * Reads up to len bytes of data from the input stream into an array of bytes.
     * Converts the read characters to lowercase and updates the input array in-place.
     * 
     * @param b         the buffer into which data is read
     * @param offset    the start offset in the data
     * @param len       the maximum number of bytes to read
     * @return          the total number of bytes read into the buffer, or -1 if there is no more data.
     * @throws          IOException if an I/O error occurs.
     */
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}