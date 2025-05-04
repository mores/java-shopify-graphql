package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OptionReorderInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Reorders options and option values on a product, causing product variants to alter their position.
 *   
 * Options order take precedence over option values order. Depending on the existing product variants,
 * some input orders might not be achieved.
 *   
 * Example:
 *   Existing product variants:
 *     ["Red / Small", "Green / Medium", "Blue / Small"].
 *   
 *   New order:
 *     [
 *       {
 *         name: "Size", values: [{ name: "Small" }, { name: "Medium" }],
 *         name: "Color", values: [{ name: "Green" }, { name: "Red" }, { name: "Blue" }]
 *       }
 *     ].
 *   
 *   Description:
 *     Variants with "Green" value are expected to appear before variants with "Red" and "Blue" values.
 *     However, "Size" option appears before "Color".
 *   
 *   Therefore, output will be:
 *     ["Small / "Red", "Small / Blue", "Medium / Green"].
 */
public class ProductOptionsReorderGraphQLQuery extends GraphQLQuery {
  public ProductOptionsReorderGraphQLQuery(String productId, List<OptionReorderInput> options,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (options != null || fieldsSet.contains("options")) {
        getInput().put("options", options);
    }
  }

  public ProductOptionsReorderGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productOptionsReorder";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private List<OptionReorderInput> options;

    private String queryName;

    public ProductOptionsReorderGraphQLQuery build() {
      return new ProductOptionsReorderGraphQLQuery(productId, options, queryName, fieldsSet);
               
    }

    /**
     * The ID of the product to update.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * Options to reorder on the product.
     */
    public Builder options(List<OptionReorderInput> options) {
      this.options = options;
      this.fieldsSet.add("options");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
