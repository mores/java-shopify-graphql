package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CheckoutBrandingInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the checkout branding settings for a
 * [checkout profile](https://shopify.dev/api/admin-graphql/unstable/queries/checkoutProfile).
 *   
 * If the settings don't exist, then new settings are created. The checkout branding settings applied to a
 * published checkout profile will be immediately visible within the store's checkout. The checkout branding
 * settings applied to a draft checkout profile could be previewed within the admin checkout editor.
 *   
 * To learn more about updating checkout branding settings, refer to the checkout branding
 * [tutorial](https://shopify.dev/docs/apps/checkout/styling).
 */
public class CheckoutBrandingUpsertGraphQLQuery extends GraphQLQuery {
  public CheckoutBrandingUpsertGraphQLQuery(String checkoutProfileId,
      CheckoutBrandingInput checkoutBrandingInput, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (checkoutProfileId != null || fieldsSet.contains("checkoutProfileId")) {
        getInput().put("checkoutProfileId", checkoutProfileId);
    }if (checkoutBrandingInput != null || fieldsSet.contains("checkoutBrandingInput")) {
        getInput().put("checkoutBrandingInput", checkoutBrandingInput);
    }
  }

  public CheckoutBrandingUpsertGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "checkoutBrandingUpsert";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String checkoutProfileId;

    private CheckoutBrandingInput checkoutBrandingInput;

    private String queryName;

    public CheckoutBrandingUpsertGraphQLQuery build() {
      return new CheckoutBrandingUpsertGraphQLQuery(checkoutProfileId, checkoutBrandingInput, queryName, fieldsSet);
               
    }

    /**
     * A globally-unique identifier.
     */
    public Builder checkoutProfileId(String checkoutProfileId) {
      this.checkoutProfileId = checkoutProfileId;
      this.fieldsSet.add("checkoutProfileId");
      return this;
    }

    /**
     * The input fields to use to upsert the checkout branding settings (pass null to reset them to default).
     */
    public Builder checkoutBrandingInput(CheckoutBrandingInput checkoutBrandingInput) {
      this.checkoutBrandingInput = checkoutBrandingInput;
      this.fieldsSet.add("checkoutBrandingInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
