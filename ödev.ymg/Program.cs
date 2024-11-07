using Microsoft.AspNetCore.Mvc;

namespace OrnekApi.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class MatematikController : ControllerBase
    {
        // GET api/matematik/ikiEkle?sayi=5
        [HttpGet("ikiEkle")]
        public IActionResult IkiEkle([FromQuery] int sayi)
        {
            int sonuc = sayi + 2;
            return Ok(new { sonuc });
        }
    }
}
