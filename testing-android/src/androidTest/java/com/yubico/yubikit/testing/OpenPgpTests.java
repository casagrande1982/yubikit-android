/*
 * Copyright (C) 2023 Yubico.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yubico.yubikit.testing;

import com.yubico.yubikit.testing.framework.OpenPgpInstrumentedTests;
import com.yubico.yubikit.testing.openpgp.OpenPgpDeviceTests;

import org.junit.Test;

public class OpenPgpTests extends OpenPgpInstrumentedTests {
    @Test
    public void testImportRsaKeys() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testImportRsaKeys);
    }

    @Test
    public void testImportEcDsaKeys() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testImportEcDsaKeys);
    }

    @Test
    public void testImportEd25519Keys() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testImportEd25519);
    }

    @Test
    public void testImportX25519Keys() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testImportX25519);
    }

    @Test
    public void testGenerateRequiresAdmin() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testGenerateRequiresAdmin);
    }

    @Test
    public void testChangePin() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testChangePin);
    }

    @Test
    public void testResetPin() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testResetPin);
    }

    @Test
    public void testSetPinAttempts() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testSetPinAttempts);
    }

    @Test
    public void testGenerateRsaKeys() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testGenerateRsaKeys);
    }

    @Test
    public void testGenerateEcKeys() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testGenerateEcKeys);
    }
    @Test
    public void testGenerateEd25519() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testGenerateEd25519);
    }

    @Test
    public void testGenerateX25519() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testGenerateX25519);
    }

    @Test
    public void testAttestation() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testAttestation);
    }
    @Test
    public void testSigPinPolicy() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testSigPinPolicy);
    }

    @Test
    public void testKdf() throws Throwable {
        withOpenPgpSession(OpenPgpDeviceTests::testKdf);
    }
}