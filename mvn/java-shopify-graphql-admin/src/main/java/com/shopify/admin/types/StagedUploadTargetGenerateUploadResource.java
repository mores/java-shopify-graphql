package com.shopify.admin.types;

/**
 * The resource type to receive.
 */
public enum StagedUploadTargetGenerateUploadResource {
  /**
   * An image associated with a collection.
   *   
   * For example, after uploading an image, you can use the
   * [collectionUpdate mutation](https://shopify.dev/api/admin-graphql/latest/mutations/collectionUpdate)
   * to add the image to a collection.
   */
  COLLECTION_IMAGE,

  /**
   * Represents any file other than HTML.
   *   
   * For example, after uploading the file, you can add the file to the
   * [Files page](https://shopify.com/admin/settings/files) in Shopify admin using the
   * [fileCreate mutation](https://shopify.dev/api/admin-graphql/latest/mutations/fileCreate).
   */
  FILE,

  /**
   * An image.
   *   
   * For example, after uploading an image, you can add the image to a product using the
   * [productCreateMedia mutation](https://shopify.dev/api/admin-graphql/latest/mutations/productCreateMedia)
   * or to the [Files page](https://shopify.com/admin/settings/files) in Shopify admin using the
   * [fileCreate mutation](https://shopify.dev/api/admin-graphql/latest/mutations/fileCreate).
   */
  IMAGE,

  /**
   * A Shopify hosted 3d model.
   *   
   * For example, after uploading the 3d model, you can add the 3d model to a product using the
   * [productCreateMedia mutation](https://shopify.dev/api/admin-graphql/latest/mutations/productCreateMedia).
   */
  MODEL_3D,

  /**
   * An image that's associated with a product.
   *   
   * For example, after uploading the image, you can add the image to a product using the
   * [productCreateMedia mutation](https://shopify.dev/api/admin-graphql/latest/mutations/productCreateMedia).
   */
  PRODUCT_IMAGE,

  /**
   * An image.
   *   
   * For example, after uploading the image, you can add the image to the
   * [Files page](https://shopify.com/admin/settings/files) in Shopify admin using the
   * [fileCreate mutation](https://shopify.dev/api/admin-graphql/latest/mutations/fileCreate).
   */
  SHOP_IMAGE,

  /**
   * A Shopify-hosted video.
   *   
   * For example, after uploading the video, you can add the video to a product using the
   * [productCreateMedia mutation](https://shopify.dev/api/admin-graphql/latest/mutations/productCreateMedia)
   * or to the [Files page](https://shopify.com/admin/settings/files) in Shopify admin using the
   * [fileCreate mutation](https://shopify.dev/api/admin-graphql/latest/mutations/fileCreate).
   */
  VIDEO,

  /**
   * Represents bulk mutation variables.
   *   
   * For example, bulk mutation variables can be used for bulk operations using the
   * [bulkOperationRunMutation mutation](https://shopify.dev/api/admin-graphql/latest/mutations/bulkOperationRunMutation).
   */
  BULK_MUTATION_VARIABLES,

  /**
   * Represents a label associated with a return.
   *   
   * For example, once uploaded, this resource can be used to [create a
   * ReverseDelivery](https://shopify.dev/api/admin-graphql/unstable/mutations/reverseDeliveryCreateWithShipping).
   */
  RETURN_LABEL,

  /**
   * Represents a redirect CSV file.
   *   
   * Example usage: This resource can be used for creating a
   * [UrlRedirectImport](https://shopify.dev/api/admin-graphql/2022-04/objects/UrlRedirectImport)
   * object for use in the
   * [urlRedirectImportCreate mutation](https://shopify.dev/api/admin-graphql/latest/mutations/urlRedirectImportCreate).
   */
  URL_REDIRECT_IMPORT,

  /**
   * Represents a file associated with a dispute.
   *   
   * For example, after uploading the file, you can add the file to a dispute using the
   * [disputeEvidenceUpdate mutation](https://shopify.dev/api/admin-graphql/latest/mutations/disputeEvidenceUpdate).
   */
  DISPUTE_FILE_UPLOAD
}
