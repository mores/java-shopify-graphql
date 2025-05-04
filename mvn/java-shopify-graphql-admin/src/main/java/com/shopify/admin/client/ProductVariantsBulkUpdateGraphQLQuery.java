package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CreateMediaInput;
import com.shopify.admin.types.ProductVariantsBulkInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates multiple variants in a single product. This mutation can be called directly or via the bulkOperation.
 */
public class ProductVariantsBulkUpdateGraphQLQuery extends GraphQLQuery {
  public ProductVariantsBulkUpdateGraphQLQuery(List<ProductVariantsBulkInput> variants,
      String productId, List<CreateMediaInput> media, Boolean allowPartialUpdates, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (variants != null || fieldsSet.contains("variants")) {
        getInput().put("variants", variants);
    }if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }if (allowPartialUpdates != null || fieldsSet.contains("allowPartialUpdates")) {
        getInput().put("allowPartialUpdates", allowPartialUpdates);
    }
  }

  public ProductVariantsBulkUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantsBulkUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<ProductVariantsBulkInput> variants;

    private String productId;

    private List<CreateMediaInput> media;

    private Boolean allowPartialUpdates;

    private String queryName;

    public ProductVariantsBulkUpdateGraphQLQuery build() {
      return new ProductVariantsBulkUpdateGraphQLQuery(variants, productId, media, allowPartialUpdates, queryName, fieldsSet);
               
    }

    /**
     * An array of product variants to update.
     */
    public Builder variants(List<ProductVariantsBulkInput> variants) {
      this.variants = variants;
      this.fieldsSet.add("variants");
      return this;
    }

    /**
     * The ID of the product associated with the variants to update.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * List of new media to be added to the product.
     */
    public Builder media(List<CreateMediaInput> media) {
      this.media = media;
      this.fieldsSet.add("media");
      return this;
    }

    /**
     * When partial updates are allowed, valid variant changes may be persisted even if some of
     * the variants updated have invalid data and cannot be persisted.
     * When partial updates are not allowed, any error will prevent all variants from updating.
     */
    public Builder allowPartialUpdates(Boolean allowPartialUpdates) {
      this.allowPartialUpdates = allowPartialUpdates;
      this.fieldsSet.add("allowPartialUpdates");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
