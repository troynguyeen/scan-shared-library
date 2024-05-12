def call(Map config = [:]) {
    timeout(time: config.timeout, unit: config.unit) {
        waitForQualityGate abortPipeline: true
    }
}