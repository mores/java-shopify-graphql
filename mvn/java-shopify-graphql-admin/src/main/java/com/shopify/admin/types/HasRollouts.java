package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * A resource that can be included in rollouts. Use this interface to query the
 * resource's rollouts with a reusable fragment.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DiscountAutomaticApp.class, name = "DiscountAutomaticApp"),
    @JsonSubTypes.Type(value = DiscountAutomaticBasic.class, name = "DiscountAutomaticBasic"),
    @JsonSubTypes.Type(value = DiscountAutomaticBxgy.class, name = "DiscountAutomaticBxgy"),
    @JsonSubTypes.Type(value = DiscountAutomaticFreeShipping.class, name = "DiscountAutomaticFreeShipping"),
    @JsonSubTypes.Type(value = DiscountCodeApp.class, name = "DiscountCodeApp"),
    @JsonSubTypes.Type(value = DiscountCodeBasic.class, name = "DiscountCodeBasic"),
    @JsonSubTypes.Type(value = DiscountCodeBxgy.class, name = "DiscountCodeBxgy"),
    @JsonSubTypes.Type(value = DiscountCodeFreeShipping.class, name = "DiscountCodeFreeShipping")
})
public interface HasRollouts {
  /**
   * The rollouts that include this resource. Walk `treatments.changes` to see
   * what each treatment does to the resource. Use `query` to filter by rollout `status`.
   */
  RolloutConnection getRollouts();
}
