package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CompanyInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a [`Company`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Company)
 * with new information. Companies represent business customers that can have
 * multiple contacts and locations with specific pricing, payment terms, and
 * checkout settings.
 *   
 * The mutation accepts the company's ID and an input object containing the
 * fields to update. You can modify the company name, add or update internal
 * notes, set an external ID for integration with other systems, or adjust the
 * customer relationship start date.
 *   
 * Learn more about [building B2B features](https://shopify.dev/docs/apps/build/b2b/start-building).
 */
public class CompanyUpdateGraphQLQuery extends GraphQLQuery {
  public CompanyUpdateGraphQLQuery(String companyId, CompanyInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CompanyUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyId;

    private CompanyInput input;

    private String queryName;

    public CompanyUpdateGraphQLQuery build() {
      return new CompanyUpdateGraphQLQuery(companyId, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the company to be updated.
     */
    public Builder companyId(String companyId) {
      this.companyId = companyId;
      this.fieldsSet.add("companyId");
      return this;
    }

    /**
     * The input fields to update the company.
     */
    public Builder input(CompanyInput input) {
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
