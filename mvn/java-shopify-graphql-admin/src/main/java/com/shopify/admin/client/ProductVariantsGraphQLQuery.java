package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductVariantSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of product variants.
 */
public class ProductVariantsGraphQLQuery extends GraphQLQuery {
  public ProductVariantsGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, ProductVariantSortKeys sortKey, String query, String savedSearchId,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }
  }

  public ProductVariantsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productVariants";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private ProductVariantSortKeys sortKey;

    private String query;

    private String savedSearchId;

    private String queryName;

    public ProductVariantsGraphQLQuery build() {
      return new ProductVariantsGraphQLQuery(first, after, last, before, reverse, sortKey, query, savedSearchId, queryName, fieldsSet);
               
    }

    /**
     * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder first(Integer first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    /**
     * The elements that come after the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
      return this;
    }

    /**
     * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder last(Integer last) {
      this.last = last;
      this.fieldsSet.add("last");
      return this;
    }

    /**
     * The elements that come before the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder before(String before) {
      this.before = before;
      this.fieldsSet.add("before");
      return this;
    }

    /**
     * Reverse the order of the underlying list.
     */
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    /**
     * Sort the underlying list using a key. If your query is slow or returns an
     * error, then [try specifying a sort key that matches the field used in the search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
     */
    public Builder sortKey(ProductVariantSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | default | string | Filter by a case-insensitive search of multiple fields
     * in a document. | | | - `query=Bob Norman`<br/> - `query=title:green hoodie` |
     * | barcode | string | Filter by the product variant [`barcode`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-barcode)
     * field. | | | - `barcode:ABC-abc-123` |
     * | collection | string | Filter by the [ID of the collection](https://shopify.dev/api/admin-graphql/latest/objects/Collection#field-id)
     * that the product variant belongs to. | | | - `collection:465903092033` |
     * | delivery_profile_id | id | Filter by the product variant [delivery profile ID](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-deliveryprofile)
     * (`ProductVariant.deliveryProfile.id`). | | | -
     * `delivery_profile_id:108179161409` |
     * | exclude_composite | boolean | Filter by product variants that aren't composites. | | | - `exclude_composite:true` |
     * | exclude_variants_with_components | boolean | Filter by whether there are [components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bundle)
     * that are associated with the product variants in a bundle. | | | -
     * `exclude_variants_with_components:true` |
     * | gift_card | boolean | Filter by the product [`isGiftCard`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-isgiftcard)
     * field. | | | - `gift_card:true` |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | inventory_quantity | integer | Filter by an aggregate of inventory across
     * all locations where the product variant is stocked. | | | -
     * `inventory_quantity:10` |
     * | location_id | id | Filter by the [location
     * ID](https://shopify.dev/api/admin-graphql/latest/objects/Location#field-id)
     * for the product variant. | | | - `location_id:88511152449` |
     * | managed | boolean | Filter by whether there is fulfillment service
     * tracking associated with the product variants. | | | - `managed:true` |
     * | managed_by | string | Filter by the fulfillment service that tracks the
     * number of items in stock for the product variant. | | | -
     * `managed_by:shopify` |
     * | option1 | string | Filter by a custom property that a shop owner uses to
     * define product variants. | | | - `option1:small` |
     * | option2 | string | Filter by a custom property that a shop owner uses to
     * define product variants. | | | - `option2:medium` |
     * | option3 | string | Filter by a custom property that a shop owner uses to
     * define product variants. | | | - `option3:large` |
     * | product_id | id | Filter by the product [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-id)
     * field. | | | - `product_id:8474977763649` |
     * | product_ids | string | Filter by a comma-separated list of product [IDs](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-id).
     * | | | - `product_ids:8474977763649,8474977796417` |
     * | product_publication_status | string | Filter by the publishable status of
     * the resource on a channel, such as the online store. The value is a
     * composite of the [channel `app`
     * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price)
     * (`Channel.app.id`) and one of the valid values. | - `approved`<br/> -
     * `rejected`<br/> - `needs_action`<br/> - `awaiting_review`<br/> -
     * `published`<br/> - `demoted`<br/> - `scheduled`<br/> -
     * `provisionally_published` | | - `publishable_status:189769876-approved` |
     * | product_status | string | Filter by a comma-separated list of product [statuses](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-status).
     * | | | - `product_status:ACTIVE,DRAFT` |
     * | product_type | string | Filter by the product type that's associated with
     * the product variants. | | | - `product_type:snowboard` |
     * | publishable_status | string | Filter by the publishable status of the
     * resource on a channel, such as the online store. The value is a composite of
     * either the [channel `app`
     * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price)
     * (`Channel.app.id`) or [channel `name`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel#field-name)
     * and one of the valid values. | - `online_store_channel`<br/> -
     * `published`<br/> - `unpublished`<br/> - `visible`<br/> - `unavailable`<br/>
     * - `hidden`<br/> - `intended`<br/> - `visible` | | -
     * `publishable_status:published`<br/> -
     * `publishable_status:189769876:visible`<br/> -
     * `publishable_status:pos:hidden` |
     * | published_status | string | Filter by the published status of the resource
     * on a channel, such as the online store. | - `unset`<br/> - `pending`<br/> -
     * `approved`<br/> - `not approved` | | - `published_status:approved` |
     * | requires_components | boolean | Filter by whether the product variant can
     * only be purchased with components. [Learn more](https://shopify.dev/apps/build/product-merchandising/bundles#store-eligibility).
     * | | | - `requires_components:true` |
     * | sku | string | Filter by the product variant [`sku`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-sku)
     * field. [Learn more about
     * SKUs](https://help.shopify.com/manual/products/details/sku). | | | -
     * `sku:XYZ-12345` |
     * | tag | string | Filter objects by the `tag` field. | | | - `tag:my_tag` |
     * | tag_not | string | Filter by objects that don’t have the specified tag. | | | - `tag_not:my_tag` |
     * | taxable | boolean | Filter by the product variant [`taxable`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-taxable)
     * field. | | | - `taxable:false` |
     * | title | string | Filter by the product variant [`title`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-title)
     * field. | | | - `title:ice` |
     * | updated_at | time | Filter by date and time when the product variant was
     * updated. | | | - `updated_at:>2020-10-21T23:39:20Z`<br/> -
     * `updated_at:&lt;now`<br/> - `updated_at:&lt;=2024` |
     * | vendor | string | Filter by the origin or source of the product variant.
     * Learn more about [vendors and managing vendor
     * information](https://help.shopify.com/manual/products/managing-vendor-info).
     * | | | - `vendor:Snowdevil`<br/> - `vendor:Snowdevil OR vendor:Icedevil` |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * The ID of a [saved search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
     * The search’s query string is used as the query argument.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
