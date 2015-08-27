package monto.service.configuration;

import org.json.simple.JSONObject;

public abstract class Option<T> implements Configuration {

    private String optionId;
    private String label;
    private String type;
    private T defaultValue;

    public Option(String optionId, String label, String type, T defaultValue) {
        this.optionId = optionId;
        this.label = label;
        this.type = type;
        this.defaultValue = defaultValue;
    }

    public String getOptionId() {
        return optionId;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    public T getDefaultValue() {
        return defaultValue;
    }

    @Override
    @SuppressWarnings("checked")
    public JSONObject encode() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("option_id", getOptionId());
        jsonObject.put("label", getLabel());
        jsonObject.put("type", getType());
        jsonObject.put("default_value", getDefaultValue().toString());
        return jsonObject;
    }
}