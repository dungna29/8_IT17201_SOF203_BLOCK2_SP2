/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2_GENERIC;

/**
 *
 * @author dungna29
 */
public class S3_Pair<J,Q> {
    private J key;
    private Q values;

    public S3_Pair() {
    }

    public S3_Pair(J key, Q values) {
        this.key = key;
        this.values = values;
    }

    public J getKey() {
        return key;
    }

    public void setKey(J key) {
        this.key = key;
    }

    public Q getValues() {
        return values;
    }

    public void setValues(Q values) {
        this.values = values;
    }
    
}
