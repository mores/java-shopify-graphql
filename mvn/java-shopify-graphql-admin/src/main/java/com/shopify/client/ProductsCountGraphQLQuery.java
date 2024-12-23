package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Count of products. Limited to a maximum of 10000.
 */
public class ProductsCountGraphQLQuery extends GraphQLQuery {
  public ProductsCountGraphQLQuery(String query, String savedSearchId, Integer limit,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }if (limit != null || fieldsSet.contains("limit")) {
        getInput().put("limit", limit);
    }
  }

  public ProductsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String query;

    private String savedSearchId;

    private Integer limit;

    private String queryName;

    public ProductsCountGraphQLQuery build() {
      return new ProductsCountGraphQLQuery(query, savedSearchId, limit, queryName, fieldsSet);
               
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | default | string | Filter by a case-insensitive search of multiple fields
     * in a document. | | | - `query=Bob Norman`<br/> - `query=title:green hoodie` |
     * | barcode | string | Filter by the product variant [`barcode`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-barcode)
     * field. | | | - `barcode:ABC-abc-1234` |
     * | bundles | boolean | Filter by a [product
     * bundle](https://shopify.dev/docs/apps/build/product-merchandising/bundles).
     * A product bundle is a set of two or more related products, which are
     * commonly offered at a discount. | | | - `bundles:true` |
     * | category_id | string | Filter by the product [category ID](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-category)
     * (`product.category.id`). A product category is the category of a product
     * from [Shopify's Standard Product Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
     * | | | - `category_id:sg-4-17-2-17` |
     * | combined_listing_role | string | Filter by the role of the product in a [combined listing](https://shopify.dev/apps/build/product-merchandising/combined-listings).
     * | - `parent`<br/> - `child`<br/> - `no_role` | | -
     * `combined_listing_role:parent` |
     * | created_at | time | Filter by the date and time when the product was
     * created. | | | - `created_at:>'2020-10-21T23:39:20Z'`<br/> -
     * `created_at:<now`<br/> - `created_at:<='2024'` |
     * | delivery_profile_id | id | Filter by the delivery profile [`id`](https://shopify.dev/api/admin-graphql/latest/objects/DeliveryProfile#field-id)
     * field. | | | - `delivery_profile_id:108179161409` |
     * | error_feedback | string | Filter by products with publishing errors. |
     * | gift_card | boolean | Filter by the product [`isGiftCard`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-isgiftcard)
     * field. | | | - `gift_card:true` |
     * | handle | string | Filter by a comma-separated list of product [handles](https://shopify.dev/api/admin-graphql/latest/queries/products#argument-query-filter-handle).
     * | | | - `handle:the-minimal-snowboard` |
     * | has_only_composites | boolean | Filter by products that have only
     * composite variants. | | | - `has_only_composites:true` |
     * | has_only_default_variant | boolean | Filter by products that have only a
     * default variant. A default variant is the only variant if no other variants
     * are specified. | | | - `has_only_default_variant:true` |
     * | has_variant_with_components | boolean | Filter by products that have
     * variants with associated components. | | | -
     * `has_variant_with_components:true` |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
     * | inventory_total | integer | Filter by inventory count. | | | -
     * `inventory_total:0`<br/> - `inventory_total:>150`<br/> -
     * `inventory_total:>=200` |
     * | is_price_reduced | boolean | Filter by products that have a reduced price.
     * For more information, refer to the [`CollectionRule`](https://shopify.dev/api/admin-graphql/latest/objects/CollectionRule)
     * object. | | | - `is_price_reduced:true` |
     * | out_of_stock_somewhere | boolean | Filter by products that are out of
     * stock in at least one location. | | | - `out_of_stock_somewhere:true` |
     * | price | bigdecimal | Filter by the product variant [`price`](https://shopify.dev/api/admin-graphql/latest/objects/Productvariant#field-price)
     * field. | | | - `price:100.57` |
     * | product_configuration_owner | string | Filter by the app
     * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/App#field-id)
     * field. | | | - `product_configuration_owner:10001` |
     * | product_publication_status | string | Filter by the publishable status of
     * the resource on a channel, such as the online store. The value is a
     * composite of the [channel `app`
     * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price)
     * (`Channel.app.id`) and one of the valid values. | - `approved`<br/> -
     * `rejected`<br/> - `needs_action`<br/> - `awaiting_review`<br/> -
     * `published`<br/> - `demoted`<br/> - `scheduled`<br/> -
     * `provisionally_published` | | - `publishable_status:189769876-approved` |
     * | product_type | string | Filter by a comma-separated list of [product
     * types](https://help.shopify.com/manual/products/details/product-type). | | |
     * - `product_type:snowboard` |
     * | publication_ids | string | Filter by a comma-separated list of publication
     * IDs that are associated with the product. | | | -
     * `publication_ids:184111530305,184111694145` |
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
     * | published_at | time | Filter by the date and time when the product was
     * published to the online store and other sales channels. | | | -
     * `published_at:>2020-10-21T23:39:20Z`<br/> - `published_at:<now`<br/> -
     * `published_at:<=2024` |
     * | published_status | string | Filter by the published status of the resource
     * on a channel, such as the online store. | - `unset`<br/> - `pending`<br/> -
     * `approved`<br/> - `not approved` | | - `published_status:approved` |
     * | sku | string | Filter by the product variant [`sku`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-sku)
     * field. [Learn more about
     * SKUs](https://help.shopify.com/manual/products/details/sku). | | | -
     * `sku:XYZ-12345` |
     * | status | string | Filter by a comma-separated list of statuses. You can
     * use statuses to manage inventory. Shopify only displays products with an
     * `ACTIVE` status in online stores, sales channels, and apps. | -
     * `ACTIVE`<br/> - `ARCHIVED`<br/> - `DRAFT` | `ACTIVE` | -
     * `status:ACTIVE,DRAFT` |
     * | tag | string | Filter objects by the `tag` field. | | | - `tag:my_tag` |
     * | tag_not | string | Filter by objects that don’t have the specified tag. | | | - `tag_not:my_tag` |
     * | title | string | Filter by the product [`title`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-title)
     * field. | | | - `title:The Minimal Snowboard` |
     * | updated_at | time | Filter by the date and time when the product was last
     * updated. | | | - `updated_at:>'2020-10-21T23:39:20Z'`<br/> -
     * `updated_at:<now`<br/> - `updated_at:<='2024'` |
     * | variant_id | id | Filter by the product variant [`id`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-id)
     * field. | | | - `variant_id:45779434701121` |
     * | variant_title | string | Filter by the product variant [`title`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-title)
     * field. | | | - `variant_title:'Special ski wax'` |
     * | vendor | string | Filter by the origin or source of the product. Learn
     * more about [vendors and managing vendor
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
     * The ID of an existing saved search.
     * The search’s query string is used as the query argument.
     * Refer to the [`SavedSearch`](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch) object.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    /**
     * The upper bound on count value before returning a result.
     */
    public Builder limit(Integer limit) {
      this.limit = limit;
      this.fieldsSet.add("limit");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
