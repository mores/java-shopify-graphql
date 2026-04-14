package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CompanyLocationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a new location for a [`Company`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Company).
 * Company locations are branches or offices where B2B customers can place orders
 * with specific pricing, catalogs, and payment terms.
 *   
 * Creates a company location. Each location can have its own billing and
 * shipping addresses, tax settings, and [`buyer experience configuration`](https://shopify.dev/docs/api/admin-graphql/latest/objects/BuyerExperienceConfiguration).
 * You can assign [staff members](https://shopify.dev/docs/api/admin-graphql/latest/objects/StaffMember) and [`CompanyContact`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CompanyContact)
 * objects to manage the location.
 */
public class CompanyLocationCreateGraphQLQuery extends GraphQLQuery {
  public CompanyLocationCreateGraphQLQuery(String companyId, CompanyLocationInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CompanyLocationCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyId;

    private CompanyLocationInput input;

    private String queryName;

    public CompanyLocationCreateGraphQLQuery build() {
      return new CompanyLocationCreateGraphQLQuery(companyId, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the company that the company location belongs to.
     */
    public Builder companyId(String companyId) {
      this.companyId = companyId;
      this.fieldsSet.add("companyId");
      return this;
    }

    /**
     * The fields to use to create the company location.
     */
    public Builder input(CompanyLocationInput input) {
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
