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
    @JsonSubTypes.Type(value = AbandonedCheckout.class, name = "AbandonedCheckout"),
    @JsonSubTypes.Type(value = Article.class, name = "Article"),
    @JsonSubTypes.Type(value = Company.class, name = "Company"),
    @JsonSubTypes.Type(value = CompanyLocation.class, name = "CompanyLocation"),
    @JsonSubTypes.Type(value = CustomerAccountAppExtensionPage.class, name = "CustomerAccountAppExtensionPage"),
    @JsonSubTypes.Type(value = CustomerAccountNativePage.class, name = "CustomerAccountNativePage"),
    @JsonSubTypes.Type(value = DraftOrder.class, name = "DraftOrder"),
    @JsonSubTypes.Type(value = Page.class, name = "Page"),
    @JsonSubTypes.Type(value = Product.class, name = "Product"),
    @JsonSubTypes.Type(value = ProductVariant.class, name = "ProductVariant")
})
public interface Navigable {
  
  String getDefaultCursor();
}
