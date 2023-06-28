# Phrase SDK and Lokalise SDK Demo App

This demo app showcases the implementation of the Phrase SDK and Lokalise SDK for localization and internationalization purposes. It provides two build variants, each demonstrating the integration with one of the SDKs. By using this app, you can experience how these SDKs can simplify the process of managing translations in your mobile applications.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Localization is a crucial aspect of app development to ensure that your app can reach a wider audience by supporting multiple languages and regions. The Phrase SDK and Lokalise SDK are powerful tools that streamline the localization process by providing features like string management, translation workflows, and real-time collaboration with translators.

This demo app aims to illustrate how to integrate the Phrase SDK and Lokalise SDK into your Android application. It includes two build variants, one for each SDK, allowing you to compare and contrast the implementation and functionality of both.

## Features

- Two build variants: Phrase SDK and Lokalise SDK
- Demonstrates integration of the respective SDKs for localization
- Displays localized strings in different languages
- Easy management of translations and localization workflows
- Real-time collaboration with translators
- Simplified string management and synchronization

## Getting Started

To get started with the Phrase SDK and Lokalise SDK demo app, follow the instructions below.

### Prerequisites

- Android Studio (version X or later)
- Git

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/demo-app.git
   ```

2. Open the project in Android Studio. 
3. Sync the project with Gradle files.

## Configuration

Before running the app, you need to configure the API keys for both the Phrase SDK and Lokalise SDK. To do this, follow the steps below:

1. Register for a free trial account at Phrase and Lokalise.

2. Obtain the API keys and Project IDs for both services.

3. Open the `strings.xml` or `.phraseapp.yml` file.

4. Replace the placeholders for the API keys and Project IDs with your own keys:

## Usage

To switch between the Phrase SDK and Lokalise SDK build variants, follow these steps:

1. Open the Build Variants panel in Android Studio (usually located on the left side of the window).

2. Select the desired build variant:

    - phraseDebug: Build variant with the Phrase SDK implementation.
    - lokaliseDebug: Build variant with the Lokalise SDK implementation.

3. Build and run the app on an emulator or physical device.

4. Explore the app and observe the localized strings based on the chosen build variant.

## Contributing
Contributions are welcome! If you encounter any issues or have suggestions for improvements, please feel free to submit a pull request or open an issue in the repository.

## License
This project is licensed under the MIT License. Feel free to use, modify, and distribute this code as per the terms of the license.
