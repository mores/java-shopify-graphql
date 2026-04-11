package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductVariantAppendMediaInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Appends existing media from a product to specific variants of that product,
 * creating associations between media files and particular product options. This
 * allows different variants to showcase relevant images or videos.
 *   
 * For example, a t-shirt product might have color variants where each color
 * variant displays only the images showing that specific color, helping
 * customers see exactly what they're purchasing.
 *   
 * Use `ProductVariantAppendMedia` to:
 * - Associate specific images with product variants for accurate display
 * - Build variant-specific media management in product interfaces
 * - Implement automated media assignment based on variant attributes
 *   
 * The operation links existing product media to variants without duplicating
 * files, maintaining efficient media storage while enabling variant-specific displays.
 *   
 * Learn more about [product variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant).
 */
public class ProductVariantAppendMediaGraphQLQuery extends GraphQLQuery {
  public ProductVariantAppendMediaGraphQLQuery(String productId,
      List<ProductVariantAppendMediaInput> variantMedia, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (variantMedia != null || fieldsSet.contains("variantMedia")) {
        getInput().put("variantMedia", variantMedia);
    }
  }

  public ProductVariantAppendMediaGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantAppendMedia";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private List<ProductVariantAppendMediaInput> variantMedia;

    private String queryName;

    public ProductVariantAppendMediaGraphQLQuery build() {
      return new ProductVariantAppendMediaGraphQLQuery(productId, variantMedia, queryName, fieldsSet);
               
    }

    /**
     * Specifies the product associated to the media.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * A list of pairs of variants and media to be attached to the variants.
     */
    public Builder variantMedia(List<ProductVariantAppendMediaInput> variantMedia) {
      this.variantMedia = variantMedia;
      this.fieldsSet.add("variantMedia");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
