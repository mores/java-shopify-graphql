package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DraftOrderBundleAddedWarning.class, name = "DraftOrderBundleAddedWarning"),
    @JsonSubTypes.Type(value = DraftOrderDiscountNotAppliedWarning.class, name = "DraftOrderDiscountNotAppliedWarning")
})
public interface DraftOrderWarning {
  
  String getErrorCode();

  
  String getField();

  
  String getMessage();
}
