package dtos;


public class QuickQuoteDTO {
    private String value;
    
    public QuickQuoteDTO(String quote) {
        this.value = quote;
    }
    
    public QuickQuoteDTO() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String quote) {
        this.value = quote;
    }
    
}
