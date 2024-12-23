package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CollectionRuleCategoryCondition.class, name = "CollectionRuleCategoryCondition"),
    @JsonSubTypes.Type(value = CollectionRuleMetafieldCondition.class, name = "CollectionRuleMetafieldCondition"),
    @JsonSubTypes.Type(value = CollectionRuleProductCategoryCondition.class, name = "CollectionRuleProductCategoryCondition"),
    @JsonSubTypes.Type(value = CollectionRuleTextCondition.class, name = "CollectionRuleTextCondition")
})
public interface CollectionRuleConditionObject {
}
