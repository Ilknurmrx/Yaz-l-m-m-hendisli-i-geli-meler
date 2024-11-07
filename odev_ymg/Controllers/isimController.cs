using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace odev_ymg.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class isimController : ControllerBase
    {
        [HttpGet("hello")]
        public ActionResult<string> GetHelloWorld()
        {
            return "İlknur";
        }
    }
}
