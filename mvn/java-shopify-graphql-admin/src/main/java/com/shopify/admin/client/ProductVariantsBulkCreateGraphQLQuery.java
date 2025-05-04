package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CreateMediaInput;
import com.shopify.admin.types.ProductVariantsBulkCreateStrategy;
import com.shopify.admin.types.ProductVariantsBulkInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates multiple variants in a single product. This mutation can be called directly or via the bulkOperation.
 */
public class ProductVariantsBulkCreateGraphQLQuery extends GraphQLQuery {
  public ProductVariantsBulkCreateGraphQLQuery(List<ProductVariantsBulkInput> variants,
      String productId, List<CreateMediaInput> media, ProductVariantsBulkCreateStrategy strategy,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (variants != null || fieldsSet.contains("variants")) {
        getInput().put("variants", variants);
    }if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }if (strategy != null || fieldsSet.contains("strategy")) {
        getInput().put("strategy", strategy);
    }
  }

  public ProductVariantsBulkCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantsBulkCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<ProductVariantsBulkInput> variants;

    private String productId;

    private List<CreateMediaInput> media;

    private ProductVariantsBulkCreateStrategy strategy;

    private String queryName;

    public ProductVariantsBulkCreateGraphQLQuery build() {
      return new ProductVariantsBulkCreateGraphQLQuery(variants, productId, media, strategy, queryName, fieldsSet);
               
    }

    /**
     * An array of product variants to be created.
     */
    public Builder variants(List<ProductVariantsBulkInput> variants) {
      this.variants = variants;
      this.fieldsSet.add("variants");
      return this;
    }

    /**
     * The ID of the product on which to create the variants.
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
     * The strategy defines which behavior the mutation should observe, such as
     * whether to keep or delete the standalone variant (when product has only a
     * single or default variant) when creating new variants in bulk.
     */
    public Builder strategy(ProductVariantsBulkCreateStrategy strategy) {
      this.strategy = strategy;
      this.fieldsSet.add("strategy");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
