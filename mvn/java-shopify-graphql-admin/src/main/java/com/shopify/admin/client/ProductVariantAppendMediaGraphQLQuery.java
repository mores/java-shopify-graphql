package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductVariantAppendMediaInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Appends media from a product to variants of the product.
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
