package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = TaxonomyAttribute.class, name = "TaxonomyAttribute"),
    @JsonSubTypes.Type(value = TaxonomyChoiceListAttribute.class, name = "TaxonomyChoiceListAttribute"),
    @JsonSubTypes.Type(value = TaxonomyMeasurementAttribute.class, name = "TaxonomyMeasurementAttribute")
})
public interface TaxonomyCategoryAttribute {
}
