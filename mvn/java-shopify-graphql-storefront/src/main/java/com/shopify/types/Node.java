package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * An object with an ID field to support global identification, in accordance with the
 * [Relay specification](https://relay.dev/graphql/objectidentification.htm#sec-Node-Interface).
 * This interface is used by the [node](https://shopify.dev/api/admin-graphql/unstable/queries/node)
 * and [nodes](https://shopify.dev/api/admin-graphql/unstable/queries/nodes) queries.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppliedGiftCard.class, name = "AppliedGiftCard"),
    @JsonSubTypes.Type(value = Article.class, name = "Article"),
    @JsonSubTypes.Type(value = Blog.class, name = "Blog"),
    @JsonSubTypes.Type(value = Cart.class, name = "Cart"),
    @JsonSubTypes.Type(value = CartLine.class, name = "CartLine"),
    @JsonSubTypes.Type(value = Collection.class, name = "Collection"),
    @JsonSubTypes.Type(value = Comment.class, name = "Comment"),
    @JsonSubTypes.Type(value = Company.class, name = "Company"),
    @JsonSubTypes.Type(value = CompanyContact.class, name = "CompanyContact"),
    @JsonSubTypes.Type(value = CompanyLocation.class, name = "CompanyLocation"),
    @JsonSubTypes.Type(value = ComponentizableCartLine.class, name = "ComponentizableCartLine"),
    @JsonSubTypes.Type(value = ExternalVideo.class, name = "ExternalVideo"),
    @JsonSubTypes.Type(value = GenericFile.class, name = "GenericFile"),
    @JsonSubTypes.Type(value = Location.class, name = "Location"),
    @JsonSubTypes.Type(value = MailingAddress.class, name = "MailingAddress"),
    @JsonSubTypes.Type(value = Market.class, name = "Market"),
    @JsonSubTypes.Type(value = MediaImage.class, name = "MediaImage"),
    @JsonSubTypes.Type(value = MediaPresentation.class, name = "MediaPresentation"),
    @JsonSubTypes.Type(value = Menu.class, name = "Menu"),
    @JsonSubTypes.Type(value = MenuItem.class, name = "MenuItem"),
    @JsonSubTypes.Type(value = Metafield.class, name = "Metafield"),
    @JsonSubTypes.Type(value = Metaobject.class, name = "Metaobject"),
    @JsonSubTypes.Type(value = Model3d.class, name = "Model3d"),
    @JsonSubTypes.Type(value = Order.class, name = "Order"),
    @JsonSubTypes.Type(value = Page.class, name = "Page"),
    @JsonSubTypes.Type(value = Product.class, name = "Product"),
    @JsonSubTypes.Type(value = ProductOption.class, name = "ProductOption"),
    @JsonSubTypes.Type(value = ProductOptionValue.class, name = "ProductOptionValue"),
    @JsonSubTypes.Type(value = ProductVariant.class, name = "ProductVariant"),
    @JsonSubTypes.Type(value = Shop.class, name = "Shop"),
    @JsonSubTypes.Type(value = ShopPayInstallmentsFinancingPlan.class, name = "ShopPayInstallmentsFinancingPlan"),
    @JsonSubTypes.Type(value = ShopPayInstallmentsFinancingPlanTerm.class, name = "ShopPayInstallmentsFinancingPlanTerm"),
    @JsonSubTypes.Type(value = ShopPayInstallmentsProductVariantPricing.class, name = "ShopPayInstallmentsProductVariantPricing"),
    @JsonSubTypes.Type(value = ShopPolicy.class, name = "ShopPolicy"),
    @JsonSubTypes.Type(value = TaxonomyCategory.class, name = "TaxonomyCategory"),
    @JsonSubTypes.Type(value = UrlRedirect.class, name = "UrlRedirect"),
    @JsonSubTypes.Type(value = Video.class, name = "Video")
})
public interface Node {
  /**
   * A globally-unique ID.
   */
  String getId();
}
