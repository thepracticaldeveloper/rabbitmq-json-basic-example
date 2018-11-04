package io.tpd.rabbitmqexample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SimplifiedPracticalTipMessage {

    private final String text;

    public SimplifiedPracticalTipMessage(@JsonProperty("text") final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "SimplifiedPracticalTipMessage{" +
                "text='" + text + '\'' +
                '}';
    }
}
