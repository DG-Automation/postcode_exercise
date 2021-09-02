package http_management;

import config_management.ConfigManager;

public class GetPostcodesHttpManager extends HttpManager{

    public GetPostcodesHttpManager(String postcodeSearch) {
        super(ConfigManager.postcodeIoBaseUrl() + ConfigManager.postcodeIoPostcodesEndpoint() + postcodeSearch);
    }
}
