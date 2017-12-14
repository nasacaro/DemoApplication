using DemoApplication;
using DemoApplication.Droid.Renderer;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

[assembly: ExportRenderer(typeof(LogInEntry), typeof(LogInEntryRenderer))]
namespace DemoApplication.Droid.Renderer
{
    class LogInEntryRenderer : EntryRenderer
    {
        protected override void OnElementChanged(ElementChangedEventArgs<Entry> e)
        {
            base.OnElementChanged(e);

            //if (Control != null)
            //{
            //    Control.SetBackgroundColor(global::Android.Graphics.Color.LightGreen);
            //}
        }
    }
}