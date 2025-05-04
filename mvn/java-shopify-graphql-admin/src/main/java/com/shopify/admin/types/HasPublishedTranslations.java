package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.List;

/**
 * Published translations associated with the resource.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Article.class, name = "Article"),
    @JsonSubTypes.Type(value = Blog.class, name = "Blog"),
    @JsonSubTypes.Type(value = Collection.class, name = "Collection"),
    @JsonSubTypes.Type(value = CookieBanner.class, name = "CookieBanner"),
    @JsonSubTypes.Type(value = Link.class, name = "Link"),
    @JsonSubTypes.Type(value = Menu.class, name = "Menu"),
    @JsonSubTypes.Type(value = OnlineStoreTheme.class, name = "OnlineStoreTheme"),
    @JsonSubTypes.Type(value = Page.class, name = "Page"),
    @JsonSubTypes.Type(value = Product.class, name = "Product"),
    @JsonSubTypes.Type(value = ProductOption.class, name = "ProductOption"),
    @JsonSubTypes.Type(value = ProductOptionValue.class, name = "ProductOptionValue"),
    @JsonSubTypes.Type(value = ProductVariant.class, name = "ProductVariant"),
    @JsonSubTypes.Type(value = SellingPlan.class, name = "SellingPlan"),
    @JsonSubTypes.Type(value = SellingPlanGroup.class, name = "SellingPlanGroup"),
    @JsonSubTypes.Type(value = Shop.class, name = "Shop"),
    @JsonSubTypes.Type(value = ShopPolicy.class, name = "ShopPolicy")
})
public interface HasPublishedTranslations {
  /**
   * The published translations associated with the resource.
   */
  List<Translation> getTranslations();
}
