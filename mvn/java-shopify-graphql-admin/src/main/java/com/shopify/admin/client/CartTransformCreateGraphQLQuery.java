package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetafieldInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates a cart transform function that lets merchants customize how products
 * are bundled and presented during checkout. This gives merchants powerful
 * control over their merchandising strategy by allowing apps to modify cart line
 * items programmatically, supporting advanced approaches like dynamic bundles or
 * personalized product recommendations.
 *   
 * For example, a bundle app might create a cart transform that automatically
 * groups related products (like a camera, lens, and case) into a single bundle
 * line item when customers add them to their cart, complete with bundle pricing
 * and unified presentation.
 *   
 * Use `CartTransformCreate` to:
 * - Deploy custom bundling logic to merchant stores
 * - Enable dynamic product grouping during checkout
 * - Implement personalized product recommendations
 * - Create conditional offers based on cart contents
 * - Support complex pricing strategies for product combinations
 *   
 * The mutation processes synchronously and returns the created cart transform
 * along with any validation errors. Once created, the cart transform function
 * becomes active for the shop and will process cart modifications according to
 * your defined logic. Cart transforms integrate with [Shopify
 * Functions](https://shopify.dev/docs/api/functions) to provide powerful
 * customization capabilities while maintaining checkout performance.
 *   
 * Cart Transform functions can be configured to block checkout on failure or
 * allow graceful degradation, giving you control over how errors are handled in
 * the customer experience.
 *   
 * Learn more about [customized bundles](https://shopify.dev/docs/apps/selling-strategies/bundles/add-a-customized-bundle).
 */
public class CartTransformCreateGraphQLQuery extends GraphQLQuery {
  public CartTransformCreateGraphQLQuery(String functionHandle, Boolean blockOnFailure,
      List<MetafieldInput> metafields, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (functionHandle != null || fieldsSet.contains("functionHandle")) {
        getInput().put("functionHandle", functionHandle);
    }if (blockOnFailure != null || fieldsSet.contains("blockOnFailure")) {
        getInput().put("blockOnFailure", blockOnFailure);
    }if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
  }

  public CartTransformCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartTransformCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String functionHandle;

    private Boolean blockOnFailure;

    private List<MetafieldInput> metafields;

    private String queryName;

    public CartTransformCreateGraphQLQuery build() {
      return new CartTransformCreateGraphQLQuery(functionHandle, blockOnFailure, metafields, queryName, fieldsSet);
               
    }

    /**
     * The handle of the Function providing the cart transform.
     */
    public Builder functionHandle(String functionHandle) {
      this.functionHandle = functionHandle;
      this.fieldsSet.add("functionHandle");
      return this;
    }

    /**
     * Whether a run failure should block cart and checkout operations.
     */
    public Builder blockOnFailure(Boolean blockOnFailure) {
      this.blockOnFailure = blockOnFailure;
      this.fieldsSet.add("blockOnFailure");
      return this;
    }

    /**
     * Additional metafields to associate to the cart transform.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      this.fieldsSet.add("metafields");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
