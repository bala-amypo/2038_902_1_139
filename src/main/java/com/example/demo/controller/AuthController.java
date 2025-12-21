@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest req) {
        AuthResponse res = new AuthResponse();
        res.setToken("dummy-jwt-token");
        res.setEmail(req.getEmail());
        res.setRole("ADMIN");
        return res;
    }
}
