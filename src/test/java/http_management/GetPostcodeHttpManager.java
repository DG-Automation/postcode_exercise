package http_management;

import config_management.ConfigManager;

public class GetPostcodeHttpManager extends HttpManager{

    public GetPostcodeHttpManager(String postcodeSearch) {
        super(ConfigManager.postcodeIoBaseUrl() + ConfigManager.postcodeIoPostcodesEndpoint() + postcodeSearch);
    }
}
