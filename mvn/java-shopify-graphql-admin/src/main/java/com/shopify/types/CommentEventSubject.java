package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * The subject line of a comment event.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Company.class, name = "Company"),
    @JsonSubTypes.Type(value = CompanyLocation.class, name = "CompanyLocation"),
    @JsonSubTypes.Type(value = Customer.class, name = "Customer"),
    @JsonSubTypes.Type(value = DraftOrder.class, name = "DraftOrder"),
    @JsonSubTypes.Type(value = Order.class, name = "Order"),
    @JsonSubTypes.Type(value = PriceRule.class, name = "PriceRule")
})
public interface CommentEventSubject {
  /**
   * Whether the timeline subject has a timeline comment. If true, then a timeline comment exists.
   */
  boolean getHasTimelineComment();

  /**
   * A globally-unique ID.
   */
  String getId();
}
