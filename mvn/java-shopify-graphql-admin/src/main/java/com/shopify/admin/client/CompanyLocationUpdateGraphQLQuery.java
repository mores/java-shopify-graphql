package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CompanyLocationUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a company location's information and B2B checkout settings. Company
 * locations are branches or offices where [`CompanyContact`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CompanyContact)
 * members place orders on behalf of the company. Contacts must be assigned to a
 * location through `roleAssignments` to place orders.
 *   
 * The mutation modifies details such as the location's name, contact
 * information, preferred locale, and internal notes. You can also configure the
 * B2B checkout experience through [`BuyerExperienceConfiguration`](https://shopify.dev/docs/api/admin-graphql/latest/objects/BuyerExperienceConfiguration)
 * settings that control whether orders require merchant review, [`PaymentTermsTemplate`](https://shopify.dev/docs/api/admin-graphql/latest/objects/PaymentTermsTemplate)
 * settings, shipping address editing permissions, and [`DepositConfiguration`](https://shopify.dev/docs/api/admin-graphql/latest/unions/DepositConfiguration) requirements.
 *   
 * Learn more about [managing company locations](https://shopify.dev/docs/apps/build/b2b/manage-client-company-locations).
 */
public class CompanyLocationUpdateGraphQLQuery extends GraphQLQuery {
  public CompanyLocationUpdateGraphQLQuery(String companyLocationId,
      CompanyLocationUpdateInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CompanyLocationUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyLocationId;

    private CompanyLocationUpdateInput input;

    private String queryName;

    public CompanyLocationUpdateGraphQLQuery build() {
      return new CompanyLocationUpdateGraphQLQuery(companyLocationId, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the company location to update.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The input fields to update in the company location.
     */
    public Builder input(CompanyLocationUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
