package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CheckoutBrandingInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the visual branding for a [`CheckoutProfile`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CheckoutProfile),
 * customizing how checkout displays to customers. Creates new branding settings
 * if none exist, or modifies existing settings.
 *   
 * The mutation accepts two levels of customization through the [`CheckoutBrandingInput`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/CheckoutBrandingInput) input object. [`designSystem`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/checkoutBrandingUpsert#arguments-checkoutBrandingInput.fields.designSystem)
 * defines foundational brand attributes like colors, typography, and corner
 * radius that apply consistently throughout checkout. [`customizations`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/checkoutBrandingUpsert#arguments-checkoutBrandingInput.fields.customizations)
 * defines styles for specific parts of the UI, individual components, or groups
 * of components like the header, buttons, form fields, and sections.
 *   
 * Changes to a published checkout profile display immediately in the store's
 * checkout. You can preview draft profiles in the Shopify admin's checkout
 * editor before publishing.
 *   
 * Learn more about [checkout styling](https://shopify.dev/docs/apps/checkout/styling).
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
