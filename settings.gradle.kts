/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

rootProject.name = "software.amazon.smithy.rust.codegen.smithy-rs"
enableFeaturePreview("GRADLE_METADATA")

include(":codegen")
include(":codegen-test")
include(":codegen-server")
include(":codegen-server-test")
include(":rust-runtime")
include(":aws:sdk-codegen")
include(":aws:sdk-codegen-test")
include(":aws:sdk")
include(":aws:rust-runtime")

include(":s3d")
