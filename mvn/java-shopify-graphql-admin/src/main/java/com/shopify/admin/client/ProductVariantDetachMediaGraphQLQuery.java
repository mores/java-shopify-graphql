package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductVariantDetachMediaInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Detaches media from product variants.
 */
public class ProductVariantDetachMediaGraphQLQuery extends GraphQLQuery {
  public ProductVariantDetachMediaGraphQLQuery(String productId,
      List<ProductVariantDetachMediaInput> variantMedia, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (variantMedia != null || fieldsSet.contains("variantMedia")) {
        getInput().put("variantMedia", variantMedia);
    }
  }

  public ProductVariantDetachMediaGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantDetachMedia";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private List<ProductVariantDetachMediaInput> variantMedia;

    private String queryName;

    public ProductVariantDetachMediaGraphQLQuery build() {
      return new ProductVariantDetachMediaGraphQLQuery(productId, variantMedia, queryName, fieldsSet);
               
    }

    /**
     * Specifies the product to which the variants and media are associated.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * A list of pairs of variants and media to be deleted from the variants.
     */
    public Builder variantMedia(List<ProductVariantDetachMediaInput> variantMedia) {
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
